Ext.define("ESISystem.view.MatriculaPanel", {
    extend: "Ext.tab.Panel",
    xtype: 'matricula',
    region: 'center',
    initComponent: function () {
        var cadastrarMatriculas = Ext.create("ESISystem.view.CadastrarMatricula");
        Ext.apply(this, {
           items:[
               cadastrarMatriculas
           ] 
        });
        this.callParent(arguments);
    }
});