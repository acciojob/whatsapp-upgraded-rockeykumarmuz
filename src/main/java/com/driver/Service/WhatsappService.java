package com.driver.Service;

import com.driver.Group;
import com.driver.Message;
import com.driver.Repositry.WhatsappRepositry;
import com.driver.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepositry whatsappRepositry;


    public String createUser(String name, String mobile) throws Exception {
        return whatsappRepositry.createUser(name, mobile);
    }

    public Group createGroup(List<User> users) {
        return whatsappRepositry.createGroup(users);

    }

    public int createMessage(String content) {
        return whatsappRepositry.createMessage(content);
    }

    public int sendMessage(Message message, User sender, Group group) throws Exception {
        return whatsappRepositry.sendMessage(message, sender, group);
    }

    public String changeAdmin(User approver, User user, Group group) throws Exception {
        return whatsappRepositry.changeAdmin(approver, user, group);
    }

    public int removeUser(User user) throws Exception {
        return whatsappRepositry.removeUser(user);
    }

    public String findMessage(Date start, Date end, int k) throws Exception {
        return whatsappRepositry.findMessage(start, end, k);
    }
}
