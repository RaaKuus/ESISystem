Ext.define("ESISystem.util.login.LoginSetup", {
    singleton: true,
    url: '/ESISystem/autenticacao/login.action',
    requires: [
        "ESISystem.util.permissions.PermissionFactory",
        "ESISystem.util.permissions.PermissionHandler"
    ],
    success: function (response, opts) {
        var result = Ext.JSON.decode(response.responseText);
        console.log(result);
        if (result.success) {
            //Devo criar uma mascara aqui!!!

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

        } else {
            Ext.Msg.alert('Erro!', result.message);
        }
    },
    failure: function (response, opts) {
        Ext.Msg.alert('Falha!', 'Falha na autenticão...');
    }
});

