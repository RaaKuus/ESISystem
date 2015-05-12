var initWindow = function(){
    Ext.create("Ext.window.Window", {
        
    }).show();
};


Ext.application({
    name: 'ESISystem',
    requires: [
        "testes.Teste"
    ],
    launch: function(){
        var teste = Ext.create("testes.Teste");
    },
    init: function(){
        
    }
});