/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thespheres.primefaces.dialog.issue;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "dfView")
public class DFView {  

    public void showDialog() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
//        PrimeFaces.current().dialog().openDynamic("/dialog", options, null);
        RequestContext.getCurrentInstance().openDialog("dialog", options, null);
    }

    public void showPDialog() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
//        PrimeFaces.current().dialog().openDynamic("/dialog", options, null);
        RequestContext.getCurrentInstance().openDialog("pDialog", options, null);
    }
}
