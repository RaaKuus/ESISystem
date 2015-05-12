Ext.define("ESISystem.util.login.LoginSetup", {
    alias: 'widget.loginsetup',
    
    url: '/ESISystem/autenticacao/login.action',
    
    loginView: null,
    splashscreen: null,
    
    requires: [
        "ESISystem.util.permissions.PermissionFactory",
        "ESISystem.util.permissions.PermissionHandler",
        "ESISystem.util.splashscreen.ContentSplashscreen",
        "ESISystem.util.splashscreen.ComponentSplashscreen"
    ],
    
    constructor: function(config){
        this.validarConfig(config);
        Ext.apply(this, config);
    },
    
    validarConfig: function(config){
        var temLoginView = typeof config.loginView !== 'undefined';
        if(!temLoginView){
            throw "[LoginSetup] loginView is not defined!";
        }
    },
    
    success: function (response, opts, loginView) {
        var result = Ext.JSON.decode(response.responseText);
        if (result.success) {
            // Suma loginView!
            //console.log(loginView);
            console.log(loginView);
            var loginViewSplashscreen = Ext.widget("componentsplashscreen", {
                componente: loginView
            });
            loginViewSplashscreen.fadeOut();
            
            //Inicializando a aplicação de acordo com as permissões do usuário
            var permissions = Ext.JSON.decode(result.permissoes);
            this.splashscreen = Ext.widget("contentsplashscreen", {
                permissions: permissions.data
            });
            
            
            /*
            var permissionFactory = ESISystem.util.permissions.PermissionFactory;
            var permissionHandler = ESISystem.util.permissions.PermissionHandler;
            var permissionGroup = Ext.JSON.decode(result.permissoes);
            var permissions = permissionFactory.getPermissions(permissionGroup.data);
            console.log(permissions);
            for (var i = 0; i < permissions.length; i++) {
                permissionHandler.addPermission(permissions[i]);
            }

            Ext.Msg.alert("Permissions Configuradas!", "Confira o que foi printado no console");
            console.log(permissionHandler.getPermissions());
            */
        } else {
            Ext.Msg.alert('Erro!', result.message);
        }
    },
    
    failure: function (response, opts) {
        Ext.Msg.alert('Falha!', 'Falha na autenticão...');
    },
    
    sendRequest: function(data){
        var me = this;
        Ext.Ajax.request({
            method: 'POST',
            url: this.url,
            params: data,
            success: function(response, opts){
                me.success(response, opts, me.loginView);
            },
            failure: this.failure
        });
    }
});

