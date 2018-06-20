/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.nbpayara.demo;

import org.nbpayara.core.DomainInfo;
import org.nbpayara.spi.DefaultRemoteLookup;
import org.nbpayara.spi.RemoteLookup;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author boris.heithecker
 */
@ServiceProvider(service = RemoteLookup.class)
public class DemoRemoteLookup extends DefaultRemoteLookup {

    public DemoRemoteLookup() {
        super("localhost", "3700");
    }

    @Override
    public DomainInfo getProviderInfo() {
        return DemoDomain.INFO;
    }

}
