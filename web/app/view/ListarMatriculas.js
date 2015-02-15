Ext.define("ESISystem.view.ListarMatriculas", {
    extend: 'Ext.grid.Panel',
    title: 'Listar Matriculas',
    autoScroll: true,
    initComponent: function(){
        var store = ESISystem.util.MatriculaUtil.getMatriculaStore();
        Ext.apply(this, {
            store: store,
            closable: true,
            columns: [
                {text: 'Matricula', dataIndex: 'matricula'},
                {text: 'Nome', dataIndex: 'nome', flex: 1},
                {text: 'Data de Matricula', dataIndex: 'dataMatricula', flex: 1}
            ],
            dockedItems: [
                {                    
                    xtype: 'pagingtoolbar',
                    store: 'matriculaStore',
                    dock: 'bottom',
                    displayInfo: true
                }
            ]
        });
        this.callParent(arguments);
    },
    listeners: {/*
      close: function(panel, eOpts){
          var gerenciadorPaineis = ESISystem.util.GerenciamentoPainel;
          gerenciadorPaineis.closePanel(
                  panel.title);
      },*/
      close : function(panel, eOpts){
          ESISystem.util.nav.ContentBodyManager.close(panel, eOpts);
      }
    }
    
});