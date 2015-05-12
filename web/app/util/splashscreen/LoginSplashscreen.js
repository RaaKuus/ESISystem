Ext.define('ESISystem.util.splashscreen.LoginSplashscreen', {
    extend: 'ESISystem.util.splashscreen.Splashscreen',
    alias: 'widget.loginsplashscreen',
    requires: [
        'ESISystem.view.login.LoginView'
    ],
    maskMessage: 'Carregando...',
    after: function(){
        Ext.widget('login');
    },
    loading: function(){
        console.log("[LoginSplashscreen] loading...");
    }
});


