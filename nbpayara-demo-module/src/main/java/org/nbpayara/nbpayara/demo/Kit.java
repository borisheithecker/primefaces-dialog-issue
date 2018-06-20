/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nbpayara.nbpayara.demo;

import org.netbeans.modules.editor.NbEditorKit;

/**
 *
 * @author boris.heithecker
 */
public class Kit extends NbEditorKit {

    @Override
    public String getContentType() { 
        return NbLiveTopComponent.MIME;
    }
}
