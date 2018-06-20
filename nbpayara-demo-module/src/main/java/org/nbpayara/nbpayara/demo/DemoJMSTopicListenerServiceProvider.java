/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.nbpayara.demo;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.nbpayara.core.DomainInfo;
import org.nbpayara.spi.JMSTopicListenerService;
import org.nbpayara.spi.JMSTopicListenerServiceProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author boris.heithecker
 */
@ServiceProvider(service = JMSTopicListenerServiceProvider.class)
public class DemoJMSTopicListenerServiceProvider implements JMSTopicListenerServiceProvider {

    public static final String MESSAGES_TOPIC = "jms/messages-topic";
    protected static final JMSTopicListenerService MESSAGES_SERVICE = new JMSTopicListenerService("jms/message-topic-factory", MESSAGES_TOPIC);

    @Override
    public List<JMSTopicListenerService> getListenerServices() {
        return Collections.singletonList(MESSAGES_SERVICE);
    }

    @Override
    public JMSTopicListenerService getListenerService(String topic) {
        if (Objects.equals(topic, MESSAGES_TOPIC)) {
            return MESSAGES_SERVICE;
        }
        return null;
    }

    @Override
    public DomainInfo getInfo() {
        return DemoDomain.INFO;
    }

}
