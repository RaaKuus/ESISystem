Ext.define("ESISystem.view.NavTreePanel", {
    extend: 'Ext.tree.Panel',
    width: 200,
    rootVisible: false,
    listeners: {/*
        itemdblclick: function(escopo, record, item, index, e, eOpts) {
            if(record.data.sub){
                var gerenciamentoPaineis = ESISystem.util.GerenciamentoPainel;
                gerenciamentoPaineis.insertPanelToMain(record.data.text);
            }
        }*/
        itemdblclick: function(escopo, record, item, index, e, eOpts){
            if(record.data.sub){
                var manager = ESISystem.util.nav.ContentBodyManager;
                console.log(record.data.text);
                var panel = manager.getContent(record.data.text);
                
                panel.show();
            }
        }
    },
    initComponent: function(){
        var store = Ext.create("ESISystem.store.NavTreeStore");
        
        Ext.apply(this, {
            store: store
        });
        this.callParent(arguments);
    }
});

