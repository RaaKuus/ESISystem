Ext.define("testes.Teste", {
    mixins: {
        observable: 'Ext.util.Observable'
    },
    
    constructor: function(config){
        this.mixins.observable.constructor.call(this, config);
    },
    
    init: function(){
        console.log("oi");
    }
});


