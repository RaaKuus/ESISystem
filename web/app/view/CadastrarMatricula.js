Ext.define("ESISystem.view.CadastrarMatricula", {
    extend: 'Ext.form.Panel',
    initComponent: function () {
        Ext.apply(this, {
            xtype: 'form',
            alias: 'widget.matricula',
            layout: {type: 'form'},
            title: 'Cadastrar Matricula',
            autoScroll: true,
            items: [
                {xtype: 'fieldset', anchor: '97%', title: 'Dados Pessoais', defaultType: 'textfield', collapsible: true, defaults: {anchor: '98%'}, items: [
                        {xtype: 'container', layout: 'hbox', defaultType: 'textfield', defaults: {anchor: '98%'}, items: [
                                {xtype: 'numberfield', flex: 1, fieldLabel: "Nº de Matricula", name: 'matricula', allowBlank: false},
                                {fieldLabel: "Nome do Aluno", flex: 1, name: 'nome', allowBlank: false, margin: '0 0 0 5'}]},
                        {fieldLabel: "Sexo", margin: '3 0 0 0', xtype: "radiogroup", cls: 'x-check-group-alt', items: [
                                {boxLabel: 'Masculino', name: "sexo", inputValue: 1, checked: true},
                                {boxLabel: 'Feminino', name: "sexo", inputValue: 2}]},
                        {xtype: 'container', layout: 'hbox', defaultType: 'textfield', defaults: {flex: 1, anchor: '98%'}, items: [
                                {fieldLabel: "Data de Nascimento", name: 'dataNascimento', xtype: 'datefield', allowBlank: false},
                                {fieldLabel: "Naturalidade", name: 'naturalidade', allowBlank: false, margin: '9 0 0 5'}]},
                        {fieldLabel: "Endereço", name: 'endereco', allowBlank: false},
                        {xtype: 'container', layout: 'hbox', margin: '7 0 0 0', defaultType: 'textfield', defaults: {flex: 1, anchor: '98%'}, items: [
                                {fieldLabel: "Nome do Pai", name: "nomePai"},
                                {fieldLabel: "Nº de Identidade do Pai", name: "identidadePai", margin: '-4 0 0 5'}]},
                        {xtype: 'container', layout: 'hbox', margin: '7 0 0 0', defaultType: 'textfield', defaults: {flex: 1, anchor: '98%'}, items: [
                                {fieldLabel: "Nome da Mãe", name: "nomeMae"},
                                {fieldLabel: "Nº de Identidade da Mãe", name: "identidadeMae", margin: '-4 0 0 5'}]},
                        {fieldLabel: "Cor/Raça", margin: '3 0 0 0', xtype: "radiogroup",
                            items: [{boxLabel: "Branco", name: "cor", id: "cor-1", inputValue: 1},
                                {boxLabel: "Pardo", name: "cor", id: "cor-2", inputValue: 2, checked: true},
                                {boxLabel: "Amarela", name: "cor", id: "cor-3", inputValue: 3},
                                {boxLabel: "Indígena", name: "cor", id: "cor-4", inputValue: 4}]},
                        {fieldLabel: "Data de Matricula", name: 'dataMatricula', allowBlank: false, xtype: 'datefield', submitFormat: 'd/m/Y'}
                    ]},
                {xtype: 'fieldset', layout: 'hbox', title: "Necessidade Educacional Especial", collapsible: true,
                    fieldDefaults: {labelAlign: 'top', msgTarget: 'side'}, defaults: {border: false, flex: 1, anchor: '99%'},
                    items: [
                        {xtype: 'container', defaultType: 'radiogroup', defaults: {layout: 'hbox', anchor: '99%'}, items: [
                                {fieldLabel: "Necessidade Visual", items: [
                                        {boxLabel: "Sim", name: "visual", inputValue: 1},
                                        {boxLabel: "Não", name: "visual", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Necessidade Auditiva", items: [
                                        {boxLabel: "Sim", name: "auditiva", inputValue: 1},
                                        {boxLabel: "Não", name: "auditiva", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Necessidade Física", items: [
                                        {boxLabel: "Sim", name: "fisica", inputValue: 1},
                                        {boxLabel: "Não", name: "fisica", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Necessidade Mental", items: [
                                        {boxLabel: "Sim", name: "mental", inputValue: 1},
                                        {boxLabel: "Não", name: "mental", inputValue: 2, checked: true, margin: '0 0 0 20'}]}]},
                        {xtype: 'container', defaultType: 'radiogroup', defaults: {anchor: '99%'}, items: [
                                {fieldLabel: "Necessidade Múltipla", items: [
                                        {boxLabel: "Sim", name: "multipla", inputValue: 1},
                                        {boxLabel: "Não", name: "multipla", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Altas Habilidades (Super dotado)", items: [
                                        {boxLabel: "Sim", name: "altasHabilidades", inputValue: 1},
                                        {boxLabel: "Não", name: "altasHabilidades", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Condutas típicas", items: [
                                        {boxLabel: "Sim", name: "condutasTipicas", inputValue: 1},
                                        {boxLabel: "Não", name: "condutasTipicas", inputValue: 2, checked: true, margin: '0 0 0 20'}]},
                                {fieldLabel: "Outra", items: [
                                        {boxLabel: "Sim", name: "outra", inputValue: 1},
                                        {boxLabel: "Não", name: "outra", inputValue: 2, checked: true, margin: '0 0 0 20'}]}]}]},
                {xtype: 'fieldset', title: 'Condições de saúde', defaultType: 'radiogroup', collapsible: true,
                    fieldDefaults: {labelAlign: 'top', msgTarget: 'side'}, defaults: {anchor: '99%', flex: 1}, items: [
                        {fieldLabel: "Tomou todas as vacinas?", items: [
                                {boxLabel: "Sim", name: "vacinas", inputValue: 1, checked: true},
                                {boxLabel: "Não", name: "vacinas", inputValue: 2}]},
                        {fieldLabel: "A criança é alérgica?", items: [
                                {boxLabel: "Sim", name: "alergica", inputValue: 1},
                                {boxLabel: "Não", name: "alergica", inputValue: 2, checked: true}]},
                        {fieldLabel: "Caso seja, indicar", xtype: 'textfield', allowBlanck: true, name: 'alergiasIndicadas'},
                        {fieldLabel: "Toma remérdio controlado?", items: [
                                {boxLabel: "Sim", name: "remedioControlado", inputValue: 1},
                                {boxLabel: "Não", name: "remedioControlado", inputValue: 2, checked: true}]},
                        {fieldLabel: "Qual?", name: "qualRemedioControlado", allowBlank: true, xtype: "textfield"}]},
                {xtype: 'fieldset', title: "Observações", defaultType: 'textarea', collapsible: true, items: [
                        {fieldLabel: "Observações", name: "observacoes", allowBlank: true, anchor: '99%'}]}],
            buttons: [
                {
                    text: 'Resetar',
                    scope: this,
                    handler: this.onResetClick
                },
                {
                    text: 'Cadastrar Aluno',
                    scope: this,
                    handler: this.onSaveClick
                }
            ]});

        this.callParent(arguments);  
    },
    
    onResetClick: function(btn, e, opts){
        console.log(btn);
        var form = btn.up('form');
        console.log(form);
        Ext.Msg.show({
            title: 'Resetar formulário?',
            message: 'Você está prestes a resetar o formulário!',
            buttons: Ext.Msg.OKCANCEL,
            icon: Ext.Msg.QUESTION,
            fn: function (btn) {
                if (btn === 'ok')
                    form.reset();
            }
        });
    },
    
    onSaveClick: function(btn, e, opts){
        var form = btn.up("form");
        if(form.isValid()){
            var basicForm = form.getForm();
            var util = ESISystem.util.MatriculaStore;
            
            var model = util.createModel(basicForm.getFieldValues());
            var store = util.getMatriculaStore();
            store.insert(1, model);
            store.sync({
                failure: function(){
                    Ext.Msg.alert('Cadastro de Matricula', 'Erro, a Matricula não foi salva!');
                },
                success: function(){
                    basicForm.reset();
                    Ext.Msg.alert('Cadastro de Matricula', 'Matricula salva com sucesso!');
                }
            });
        }
    }
});