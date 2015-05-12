Ext.define('ESISystem.view.login.LoginView', {
    extend: 'Ext.window.Window',
    
    title: 'Login',
    alias: 'widget.login',
    
    width: 330,
    height: 180,
    layout: 'fit',
    closable: false,
    autoShow: true,
    
    defaultListenerScope: true,
    referenceHolder: true,
    viewModel: 'default',
    
    requires: [
      "ESISystem.ux.CpfField",
      "ESISystem.util.login.LoginSetup"
    ],
    
    defaultButton: 'username',
    
    items: [
        {
            xtype: 'form',
            padding: 15,
            reference: 'loginForm',
            defaults: {
                anchor: '100%',
                allowBlank: false,
                enableKeyEvents: true,
                xtype: 'textfield',
                listeners: {
                    keypress: 'onKeyPress'
                }
            },
            fieldDefaults: {
                msgTarget: 'under'
            },
            items: [
                {
                    bind: '{username}',
                    itemId: 'username',
                    fieldLabel: 'Usuário',
                    xtype: 'cpffield'
                },
                {
                    inputType: 'password',
                    bind: '{password}',
                    fieldLabel: 'Senha'
                },
                {
                    xtype: 'button',
                    text: 'Login',
                    margin: '15 0 0 200',
                    formBind: true,
                    handler: 'onLoginClick'
                }
            ]
            
        }
    ],
    
    onLoginClick: function(){
        var me = this; 
        var data = me.getViewModel().getData();
        var loginSetup = Ext.widget("loginsetup", {
            loginView: this
        });
        loginSetup.sendRequest(data);
    },
    
    onKeyPress: function(field, e){
        var me = this, form = me.lookupReference('loginForm');
        if(form.isValid() && Ext.EventObject.ENTER === e.getKey()){
            me.onLoginClick();
        }
    }
    
});