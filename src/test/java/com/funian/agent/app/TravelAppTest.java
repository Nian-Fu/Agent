package com.funian.agent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther FuNian
 * @Date 2025/7/2 16:39
 * @ClassName:TravelAppTest
 * @School SiChuan University
 * @Major Computer Software
 */
@SpringBootTest
class TravelAppTest {


    @Resource
    private TravelApp TravelApp;

    @Test
    void testChat() {
        String chatId = UUID.randomUUID().toString();
        // 第一轮
        String message = "你好，我是四川大学的付念";
        String answer = TravelApp.doChat(message, chatId);
        // 第二轮
        message = "我想让另一半更爱我";
        answer = TravelApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);
        // 第三轮
        message = "我的另一半叫什么来着？刚跟你说过，帮我回忆一下";
        answer = TravelApp.doChat(message, chatId);
        Assertions.assertNotNull(answer);
    }

    @Test
    void doChatWithReport() {
        String chatId = UUID.randomUUID().toString();
        String message = "你好，我是付念，我想让另一半（丽姐）更爱我，但我不知道该怎么做";
        TravelApp.TravelReport TravelReport = TravelApp.doChatWithReport(message, chatId);
        Assertions.assertNotNull(TravelReport);
    }

}
