var initWindow = function(){
    Ext.create("Ext.window.Window", {
        title: 'Adicionar Login',
        width: 350,
        height: 320,
        closable: false,
        layout: 'fit',
        viewModel: 'default',
        defaultListenerScope: true,
        referenceHolder: true,
        items:[
            {
                xtype: 'form',
                padding: 15,
                reference: 'adicionarLoginForm',
                defaults: {
                    anchor: '100%',
                    allowBlank: false,
                    xtype: 'textfield'
                },
                items: [
                    {
                        bind: '{cpf}',
                        itemId: 'cpf',
                        fieldLabel: 'CPF',
                        xtype: 'cpffield'
                    },
                    {
                        bind: '{firstPassword}',
                        itemId: 'firstPassword',
                        fieldLabel: "Senha",
                        inputType: 'password'
                    },
                    {
                        bind: '{secondPassword}',
                        itemId: 'secondPassword',
                        fieldLabel: 'Repetir Senha',
                        inputType: 'password'
                    },
                    {
                        xtype: 'fieldcontainer',
                        fieldLabel: 'Permissões',
                        defaultType: 'checkboxfield',
                        items: [
                            {
                                boxLabel  : 'Diretor',
                                name      : 'diretor',
                                inputValue: 'true',
                                bind: '{permissions.diretor}'
                            },
                            {
                                boxLabel  : 'Secretário',
                                name      : 'secretario',
                                inputValue: 'true',
                                bind: '{permissions.secretario}'
                            },
                            {
                                boxLabel  : 'Coordenador',
                                name      : 'coordenador',
                                inputValue: 'true',
                                bind: '{permissions.coordenador}'
                            },
                            {
                                boxLabel  : 'Professor',
                                name      : 'professor',
                                inputValue: 'true',
                                bind: '{permissions.professor}'
                            }
                        ]
                    },
                    {
                        xtype: 'button',
                        text:'Adicionar Login',
                        formBind: true,
                        margin: '20 0 0 0',
                        handler: 'onAddLoginClick'
                    }
                ]
            }
        ],
        defaultButton: 'cpf',
        onAddLoginClick: function(){
            var me = this;
            var data = me.getViewModel().getData();
            
            var senhasIguais = data.firstPassword === data.secondPassword;
            if(!senhasIguais){
                Ext.Msg.alert("Erro!", "As senhas precisam ser iguais!");
                return;
            }
            var permissionUndefined = typeof data.permissions === 'undefined';
            if(permissionUndefined){
                console.log("Permissioes não definidas");
                return;
            }
            
            var permissions = {};
            permissions.data = [];
            var temSecretario = typeof data.permissions.secretario !== 'undefined' && data.permissions.secretario;
            var temDiretor = typeof data.permissions.diretor !== 'undefined' && data.permissions.diretor;
            var temCoordenador = typeof data.permissions.coordenador !== 'undefined' && data.permissions.coordenador;
            var temProfessor = typeof data.permissions.professor !== 'undefined' && data.permissions.professor;
            
            if(temSecretario){
                permissions.data.push("secretario");
            }
            if(temDiretor){
                permissions.data.push("diretor");
            }
            if(temCoordenador){
                permissions.data.push("coordenador");
            }
            if(temProfessor){
                permissions.data.push("professor");
            }
            var permissionData = Ext.JSON.encode(permissions);
            
            Ext.Ajax.request({
                method: 'POST',
                url: '/ESISystem/autenticacao/add-login.action',
                params: {
                    cpf: data.cpf,
                    senha: data.firstPassword,
                    permissoes: permissionData
                },
                success: function(response, opts){
                    console.log("Sucesso!");
                    console.log(response);
                    console.log(opts);
                },
                failure: function(response, opts){
                    console.log("Falha");
                    console.log(response);
                    console.log(opts);
                }
            });
        }
    }).show();
};

Ext.application({
    name: 'ESISystem',
    requires: [
        "ESISystem.ux.CpfField"
    ],
    launch: function(){
        initWindow();
    },
    init: function(){
        console.log("init");
    }
});


