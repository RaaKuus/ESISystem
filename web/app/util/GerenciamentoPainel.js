Ext.define("ESISystem.util.GerenciamentoPainel",{
    singleton: true,
    paineis: [],
    mainPanel: null,
    paineisAtuais: [],
    setMainPanel: function(obj){
        this.mainPanel = obj;
    },
    getMainPanel: function(){
        return this.mainPanel;
    },
    registrar: function(arr){
        var me = this;
        arr.forEach(function(obj){
            me.registrarPainel(obj.nome, obj.painel, obj.inicial);
        });
    },
    registrarPainel: function(nome, painel, inicial){
        function $(nome, painel, inicial){
            return {
                nome: nome,
                painel: painel,
                inicial: (typeof inicial !== "undefined" ? inicial : false )
            };
        } 
        for(var i = 0; i < this.paineis.length; i++){
            if(this.paineis[i].nome === nome){
                throw "Painel "+nome+" já foi registrado!";
                return;
            }
        }
        var painel = $(nome, painel, inicial);
        this.paineis.push(painel);
    },
    getPaineisIniciais: function(){
        var p = [];
        this.paineis.forEach(function(obj){
            if(obj.inicial)
                p.push(obj.nome);
        });
        return p;
    },
    getPainel: function(nome){
        for(var i = 0; i < this.paineis.length; i++){
            if(this.paineis[i].nome === nome)
                return this.paineis[i];
        }
        throw "Painel não encontrado";
    },
    checkPainel: function(nome){
        for(var i = 0; i < this.paineisAtuais.length; i++){
            if(this.paineisAtuais[i].nome === nome)
                return false;
        }
        return true;
    },
    insertPanelToMain: function(nome){
        var check = this.checkPainel(nome);
        if(check){
            var painel = this.getPainel(nome);
            var extPainel = Ext.create(painel.painel);
            if(painel){
                this.getMainPanel().add(extPainel);
                this.paineisAtuais.push(painel);
            }
        }
    },
    insertPanelsToMain: function(arr){
        var me = this;
        arr.forEach(function(obj){
            me.insertPanelToMain(obj);
        });
    },
    closePanel: function(nome){
        for(var i = 0; i < this.paineisAtuais.length; i++){
            if(this.paineisAtuais[i].nome === nome)
                this.paineisAtuais.remove(i);
        }
    }
});

