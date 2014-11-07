Ext.define("ESISystem.store.MatriculaStore", {
    extend: 'Ext.data.Store',
    model: 'ESISystem.model.MatriculaModel',
    pageSize: 35,
    //autoSync: true,
    autoLoad: {start: 0, limit: 35},
    
    proxy: {
        type: 'ajax',
        api: {
            read : 'matricula/view.action',
            create : 'matricula/create.action',
            update: 'matricula/create.action',
            destroy: 'matricula/delete.action'
        },
        reader: {
            type: 'json',
            rootProperty: 'data',
            successProperty: 'success'
        },
        writer: {
            type: 'json',
            writeAllFields: false,
            encode: false,
            rootProperty: 'data'
        },
        listeners: {
            exception: function(proxy, response, operation){
                var msg;
                if(response)
                    msg = response;
                msg = operation.getError();
                Ext.MessageBox.show({
                    title: 'REMOTE EXCEPTION',
                    msg: msg,
                    icon: Ext.MessageBox.ERROR,
                    buttons: Ext.Msg.OK
                });
            }
        }
    }
});