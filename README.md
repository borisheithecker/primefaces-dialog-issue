# primefaces-dialog-issue


The app displays two dialogs: dialog.xhtlm & pDialog.xhtml. 

Both dialogs display a p:selectOneRadio

In pDialog.xhmtl selection change are not submitted, i.e. DFDialogView.setSelectedItem is not called. 

Obviously, this is the case because pDialog.xhtml is not full-fledged html page. It does not load the js libraries. 

Using chrome debugger you can see that dialog.xhtml loads more resources and openes a fresh page; pDialog.xhtml simply adds to the current page. 
