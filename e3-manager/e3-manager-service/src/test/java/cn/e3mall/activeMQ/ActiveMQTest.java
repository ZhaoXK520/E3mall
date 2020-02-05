package cn.e3mall.activeMQ;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;

public class ActiveMQTest {

//	@Test
//	public void testQueueProducer() throws Exception {
//		// 1.创建一个连接工厂对象，需要指定服务的ip及端口
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.130:61616");
//		// 2.使用工厂对象创建一个connection对象
//		Connection connection = connectionFactory.createConnection();
//		// 3.开启连接，调用connection对象的start方法
//		connection.start();
//		// 4.创建一个Session对象
//		// 第一个参数；是否开启事务，如果开启事务，第二个参数无意义。一般不开启事务false。
//		// 第二个参数：应答模式自动应答或者手动应答。一般自动应答
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		// 5.使用Session对象创建一个Destination对象，两种形式queue、topic，现在应该使用queue
//		Queue queue = session.createQueue("test-queue");
//		// 6.使用Session对象创建一个Producer对象
//		MessageProducer producer = session.createProducer(queue);
//		// 7.创建一个Message对象，可以使用TextMessage
//		// TextMessage textMessage = new ActiveMQTextMessage();
//		// textMessage.setText("hell ActiveMQ");
//		TextMessage textMessage = session.createTextMessage("hello activeMQ");
//		// 8.发送消息
//		producer.send(textMessage);
//		// 9.关闭消息
//		producer.close();
//		session.close();
//		connection.close();
//	}
//
//	@Test
//	public void testQueueConsumer() throws Exception {
//		// 1.创建一个连接工厂对象，需要指定服务的ip及端口。
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.130:61616");
//		// 2.使用工厂对象创建一个Connection对象。
//		Connection connection = connectionFactory.createConnection();
//		// 3.开启连接，调用Connection对象的start方法
//		connection.start();
//		// 4.创建一个Session对象.
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		// 5.使用Session对象创建一个Destination对象，两种形式queue、topic，现在应该使用queue
//		Queue queue = session.createQueue("test-queue");
//		// 6.使用Session对象创建一个Consumer对象
//		MessageConsumer consumer = session.createConsumer(queue);
//		// 7.接收消息
//		consumer.setMessageListener(new MessageListener() {
//
//			@Override
//			public void onMessage(Message message) {
//				// 8.打印消息
//				TextMessage textMessage = (TextMessage) message;
//				String text;
//				try {
//					text = textMessage.getText();
//					System.out.println(text);
//				} catch (JMSException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		// 9.等待接收消息
//		System.in.read();
//		// 10.关闭资源
//		consumer.close();
//		session.close();
//		connection.close();
//	}
//
//	@Test
//	public void testTopicProducer() throws Exception {
//		// 1.创建一个连接工厂对象，需要指定服务的ip及端口
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.130:61616");
//		// 2.使用工厂对象创建一个connection对象
//		Connection connection = connectionFactory.createConnection();
//		// 3.开启连接，调用connection对象的start方法
//		connection.start();
//		// 4.创建一个Session对象
//		// 第一个参数；是否开启事务，如果开启事务，第二个参数无意义。一般不开启事务false。
//		// 第二个参数：应答模式自动应答或者手动应答。一般自动应答
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		// 5.使用Session对象创建一个Destination对象，两种形式queue、topic，现在应该使用topic
//		Topic topic = session.createTopic("test-topic");
//		// 6.使用Session对象创建一个Producer对象
//		MessageProducer producer = session.createProducer(topic);
//		// 7.创建一个Message对象，可以使用TextMessage
//		// TextMessage textMessage = new ActiveMQTextMessage();
//		// textMessage.setText("hell ActiveMQ");
//		TextMessage textMessage = session.createTextMessage("hello activeMQ");
//		// 8.发送消息
//		producer.send(textMessage);
//		// 9.关闭消息
//		producer.close();
//		session.close();
//		connection.close();
//	}
//
//	
//	@Test
//	public void testTopicConsumer() throws Exception {
//		// 1.创建一个连接工厂对象，需要指定服务的ip及端口。
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.25.130:61616");
//		// 2.使用工厂对象创建一个Connection对象。
//		Connection connection = connectionFactory.createConnection();
//		// 3.开启连接，调用Connection对象的start方法
//		connection.start();
//		// 4.创建一个Session对象.
//		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//		// 5.使用Session对象创建一个Destination对象，两种形式queue、topic，现在应该使用topic
//		Topic topic = session.createTopic("test-topic");
//		// 6.使用Session对象创建一个Consumer对象
//		MessageConsumer consumer = session.createConsumer(topic);
//		// 7.接收消息
//		consumer.setMessageListener(new MessageListener() {
//
//			@Override
//			public void onMessage(Message message) {
//				// 8.打印消息
//				TextMessage textMessage = (TextMessage) message;
//				String text;
//				try {
//					text = textMessage.getText();
//					System.out.println(text);
//				} catch (JMSException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		// 9.等待接收消息
//		System.out.println("topic消费者4已启动。。。");
//		System.in.read();
//		// 10.关闭资源
//		consumer.close();
//		session.close();
//		connection.close();
//	}
}
