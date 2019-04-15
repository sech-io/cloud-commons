package com.sech.commons.rabbitmq.service;

import com.sech.commons.rabbitmq.beans.MqMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * MQ 服务
 *
 * @author sech.io
 */
public interface MqService extends RabbitTemplate.ConfirmCallback {

    /**
     * 发送消息到rabbitmq消息队列
     *
     * @param message    消息内容
     * @param exchange   交换配置
     * @param routingKey 队列配置
     * @throws Exception
     */
    public <T> void send(MqMessage<T> message, String exchange, String routingKey);

}
