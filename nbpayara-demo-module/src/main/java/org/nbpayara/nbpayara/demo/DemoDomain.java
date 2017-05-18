/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.nbpayara.demo;

import java.io.File;
import java.util.Properties;
import org.nbpayara.core.Domain;
import org.nbpayara.core.DomainInfo;
import org.nbpayara.spi.JMSTopicListenerService;
import org.nbpayara.spi.JMSTopicListenerServiceProvider;
import org.openide.modules.InstalledFileLocator;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author boris.heithecker
 */
@ServiceProvider(service = Domain.class)
public class DemoDomain implements Domain {

    public static DomainInfo INFO = new DomainInfo("NbPayara Demo", "demo");

    @Override
    public DomainInfo getProviderInfo() {
        return INFO;
    }

    @Override
    public Properties getInstanceProperties() throws IllegalStateException {
        Properties props = new Properties();
        File f = InstalledFileLocator.getDefault().locate("demo-domain", "org.nbpayara.nbpayara.demo.module", false);
        props.put(Domain.INSTANCE_ROOT_PROP_NAME, f.getAbsolutePath());
        return props;
    }

    @Override
    public void instanceStarted(Instance cb) {
        final JMSTopicListenerServiceProvider jms = JMSTopicListenerServiceProvider.find(INFO.getURL());
        jms.getListenerServices().stream()
                .forEach(JMSTopicListenerService::initialize);
    }

    @Override
    public void instanceStopped() {
    }

}
