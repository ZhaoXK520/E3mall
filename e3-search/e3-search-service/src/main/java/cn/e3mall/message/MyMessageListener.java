package cn.e3mall.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		// 取消息内容
		TextMessage textMessage = (TextMessage) message;
		try {
			String text = textMessage.getText();
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
