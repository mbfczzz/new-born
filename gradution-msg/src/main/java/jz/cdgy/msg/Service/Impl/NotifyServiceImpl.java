package jz.cdgy.msg.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.common.config.SpringContextUtil;
import jz.cdgy.mbg.mapper.MsgMapper;
import jz.cdgy.mbg.mapper.UserMsgMapper;
import jz.cdgy.mbg.pojo.*;
import jz.cdgy.msg.Dto.MsgDto;
import jz.cdgy.msg.Email.ToEmail;
import jz.cdgy.msg.Service.NotifyService;
import jz.cdgy.mbg.mapper.MsgModelMapper;
import jz.cdgy.mbg.mapper.UserMapper;
import jz.cdgy.msg.mapper.NotifyMapper;
import jz.cdgy.msg.model.Email;
import jz.cdgy.msg.util.AssertsUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private MsgModelMapper msgModelMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MsgMapper msgMapper;

    @Autowired
    private NotifyMapper notifyMapper;

    @Autowired
    private UserMsgMapper userMsgMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public <T> void SendEmail(List<Integer> id,Class<T> clazz) throws MessagingException {
        QueryWrapper<MsgModel> queryWrapper = new QueryWrapper();
        queryWrapper.eq("way_id",1);
        queryWrapper.eq("is_use",1);
        User user = userMapper.selectByPrimaryKey(id.get(0));
        MsgModel msgModel = msgModelMapper.selectOne(queryWrapper);
        Email email = new Email();
        email.setTitle(user.getUsername()+msgModel.getTitle());
        email.setSubject(user.getUsername()+msgModel.getMsgContent());
        email.setTargets(new String[]{"a317242393@163.com"});
        ToEmail send = (ToEmail) SpringContextUtil.getBean(clazz);
        send.sendEmail(email);
        Msg msg = new Msg();
        msg.setModelId(msgModel.getId());
        msg.setMsgSource(1);
        msg.setSendTime(new Date());
        msg.setSendPeople("??????????????????");
        msg.setSendSubject(1);
        msg.setMsgTitle(email.getTitle());
        msg.setMsgContent(email.getSubject());
        msg.setSendWay(msgModel.getWayId());
        AssertsUtil.isTrue(msgMapper.insertSelective(msg)!=0,"??????????????????!");
    }

    @Override
    public void activeSendEmail(List<Integer> ids, Integer mid) {

    }

    @Override
    public PageInfo<MsgDto> getAllNotify(Integer page, Integer limit, MsgDto msgDto) {
        PageHelper.startPage(page,limit);
        return new PageInfo<>(notifyMapper.getAllNotify(msgDto));
    }

    @Override
    public List<Map> getSendWay() {
        return notifyMapper.getSendWay();
    }

    @Override
    public List<Map> getNotifyTemplate() {
        return notifyMapper.getNotifyTemplate();
    }

    @Override
    public MsgModel getCurrentTemplate(String id) {
        return notifyMapper.getCurrentTemplate(id);
    }

    @Override
    @Transactional
    public void sendMessage(Msg msg) {
        msg.setType("?????????????????????");
        msg.setSendTime(new Date());
        msg.setMsgSource(3);
        msg.setSendSubject(2);
        msg.setMsgStatus(3);
        msgMapper.insertSelective(msg);
        int flag = msg.getId();
        List<Integer> ids = userMapper.getAllId();
        setUserMes(ids,flag);
        AssertsUtil.isTrue(flag==-1,"??????????????????");
    }

    @Override
    public List<Map> getMsgSource() {
        return notifyMapper.getMsgSource();
    }

    @Override
    public List<Map> getSendSubject() {
        return notifyMapper.getSendSubject();
    }

    @Override
    public String updateMessage(MsgDto msgDto) {
        notifyMapper.updateMessage(msgDto);
        return "????????????";
    }

    @Override
    @Transactional
    public void deleteMsg(List<Integer> ids) {
        ids.forEach(id->{
            AssertsUtil.isTrue(notifyMapper.deleteByPrimaryKey(id)!=1,"????????????!");
        });
    }

    @Override
    @Transactional
    public void checkOk(List<Integer> ids) {
        ids.forEach(id->{
            AssertsUtil.isTrue(notifyMapper.checkOk(id)!=1,"????????????");
            rabbitTemplate.convertAndSend("msg-websocket-exchange","msg-websocket-key",id);
        });
    }

    @Override
    public void msgReject(List<Integer> ids) {
        ids.forEach(id->{
            AssertsUtil.isTrue(notifyMapper.msgReject(id)!=1,"????????????");
        });
    }

    @Override
    public PageInfo<MsgDto> getAllCheckNotify(Integer page, Integer limit, MsgDto msgDto) {
        PageHelper.startPage(page,limit);
        return new PageInfo<>(notifyMapper.getAllCheckNotify(msgDto));
    }

    @Override
    public PageInfo<MsgDto> getMessageByName(Integer page,Integer limit,String id) {
        PageHelper.startPage(page,limit);
        return new PageInfo<>(notifyMapper.getMessageByName(id));
    }

    private void setUserMes(List<Integer> ids,int msgid){
            ids.forEach(id->{
                UserMsg userMsg = new UserMsg();
                userMsg.setUid(id);
                userMsg.setMesId(msgid);
                userMsg.setIsRead(0);
                userMsg.setMaxId(0);
                userMsgMapper.insertSelective(userMsg);
            });
    }

    @Override
    public PageInfo<MsgDto> getMessageByUser(Integer page, Integer limit, String id) {
        PageHelper.startPage(page,limit);
        return new PageInfo<>(notifyMapper.getMessageByUser(id));
    }

    @Override
    public MsgDto getMessageByCurrent(String mid) {
        return notifyMapper.getMessageByCurrent(mid);
    }

    @Override
    public void updateUserMessage(String uid, String mid) {
        AssertsUtil.isTrue(notifyMapper.updateUserMessage(uid,mid)!=1,"????????????!");;
    }
}
