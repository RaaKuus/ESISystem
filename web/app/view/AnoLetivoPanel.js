Ext.define("ESISystem.view.AnoLetivoPanel", {
    extend: "Ext.window.Window",
    title: "Cadastrar Ano Letivo",
    width: 350,
    height: 145,
    initComponent: function(){
        var cadastrarAnoLetivo = Ext.create("ESISystem.view.CadastrarAnoLetivo");
        
        Ext.apply(this, {
            items: [
                cadastrarAnoLetivo
            ]
        });
        
        this.callParent(arguments);
    }
});