/**
 * Copyright (C), dzmsoft Co., Ltd
 */
																																									/**
 * 初始加载
 */
$(function(){
	initActions();
	createDg();
});
/**
 * 变量区
 */
var dgList; // 列表
var dForm;// 对话框
var sexArray = new DataDictionary(DICTIONARY_FIELD.SEX);
var statusArray = new DataDictionary(DICTIONARY_FIELD.EMP_STATUS);
var empTypeArray = new DataDictionary(DICTIONARY_FIELD.CLEAN_EMP_TYPE);
/**
 * 初始化绑定事件
 */
function initActions(){
	$('#searchFrom_find').on('click',function(){find();});
	$('#searchFrom_reset').on('click',function(){reset();});
	$('.add').linkbutton({'onClick':function(){add();}});
	$('.edit').linkbutton({'onClick':function(){edit();}});
	$('.remove').linkbutton({'onClick':function(){remove();}});
	$('.quit').linkbutton({'onClick':function(){quit();}});
	statusArray.getFields();
	sexArray.getFields();
	empTypeArray.getFields();
	empTypeArray.initCombobox($('#filter_eqs_userType'));
}
/**
 * 查询
 */
function find(){
	var obj=$("#searchFrom").serializeObject();
	dgList.datagrid('load',obj); 
}
/**
 * 重置
 */
function reset(){
	$('#searchFrom').form('clear');
	find();
}
/*
 * 创建表格
 */
function createDg(){
	dgList=$('#dg').datagrid({    
	method: "post",url:ctx+'/smsEmployee/find', idField : 'id',singleSelect:true,
    fit : true,fitColumns : true,border : false,striped:true,
	pagination:true,rownumbers:true,pageNumber:1,pageSize : 20,pageList : [ 20, 30, 50 ],
    columns:[[    
    	    	    		    			{field:'id',title:'认证编号',sortable:true,width:100,align:'left',halign:'center'}
    		    	    		    			,{field:'name',title:'姓名',sortable:true,width:100,align:'left',halign:'center' }
    		    	    		    			,{field:'sex',title:'性别',sortable:true,width:100,align:'left',halign:'center',formatter:fmtSex }
    		    	    		    			,{field:'birthday',title:'出生日期',sortable:true,width:100,align:'left',halign:'center' ,formatter:DzmFrame.EasyUI.fmtYyyyMMdd}
    		    	    		    			,{field:'idCard',title:'身份证号',sortable:true,width:100,align:'left',halign:'center',formatter:DzmFrame.EasyUI.fmtIdCard }
    		    	    		    			,{field:'mobile',title:'手机号',sortable:true,width:100,align:'left',halign:'center',formatter:DzmFrame.EasyUI.fmtMobile }
    		    	    		    			,{field:'userType',title:'用户类型',sortable:true,width:100,align:'left',halign:'center',formatter:fmtEmpType }
    		    	    		    			,{field:'experienceValue',title:'经验值',sortable:true,width:100,align:'left',halign:'right' }
    		    	    		    			,{field:'goodRatio',title:'好评率',sortable:true,width:100,align:'left',halign:'right' }
    		    	    		    			,{field:'goodCount',title:'好评数',sortable:true,width:100,align:'left',halign:'right' }
    		    	    		    			,{field:'badCount',title:'差评数',sortable:true,width:100,align:'left',halign:'right' }
    		    	    		    			,{field:'status',title:'状态',sortable:true,width:100,align:'left',halign:'center',formatter:fmtStatus}
    		    	    		    			,{field:'healthEndDate',title:'健康证有效截止日期',sortable:true,width:100,align:'left',halign:'center' ,formatter:DzmFrame.EasyUI.fmtYyyyMMdd}
    		    	    ]],
    sortName:'name',sortOrder:'asc',
    enableHeaderClickMenu: false,
    enableHeaderContextMenu: false,
    toolbar:'#tb'
	});
}
function fmtSex(val){
	return sexArray.showDisplay(val);
}
function fmtEmpType(val){
	return empTypeArray.showDisplay(val);
}
function fmtStatus(val){
	return statusArray.showDisplay(val);
}
/**
 * 新增
 */
function add(){
	dForm=$('#dlg').dialog({title:'新增',width: 800, height: 600,modal:true
		,href:ctx+'/smsEmployee/add',
		buttons:[
			{text:'提交',handler:function(){submit();}}
			,{text:'返回',handler:function(){dForm.panel('close');}}
		]
	});
}
/**
 * 编辑
 */
function edit(){
	var row = dgList.datagrid('getSelected');
	if(rowIsNull(row)) return;
	dForm=$('#dlg').dialog({title:'编辑',width: 800, height: 600,modal:true
		,href:ctx+'/smsEmployee/edit/'+row.id,
		buttons:[
			{text:'提交',handler:function(){submit();}}
			,{text:'返回',handler:function(){dForm.panel('close');}}
		]
	});
}
/**
 * 删除用户
 */
function remove(){
	var row = dgList.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '删除后无法恢复您确定要删除？', function(data){
		if (data){
			$.ajax({
				type:'get',
				url:ctx+"/smsEmployee/remove/"+row.id,
				success: function(data){
					if (data.success){
						$.messager.alert('系统提示',data.msg,'info',function(){
							find();
						});
					} else{
						$.messager.alert('系统提示',data.msg,'error');
					}
				}
			});
		} 
	});
}
/**
 * 离职
 */
function quit(){
	var row = dgList.datagrid('getSelected');
	if(rowIsNull(row)) return;
	parent.$.messager.confirm('提示', '您确定该员工离职吗？', function(data){
		if (data){
			$.ajax({
				type:'put',
				url:ctx+"/smsEmployee/quit/"+row.id,
				success: function(data){
					if (data.success){
						$.messager.alert('系统提示',data.msg,'info',function(){
							find();
						});
					} else{
						$.messager.alert('系统提示',data.msg,'error');
					}
				}
			});
		} 
	});
}
/**
 * 提交
 */
function submit(){
	$('#mainform').form('submit',{
		onSubmit:function(){
			var isValid = $(this).form('enableValidation').form('validate');
			if (isValid){
				$.messager.progress();
			}
			return isValid;	// 返回false终止表单提交
		},
		success:function(result){
			$.messager.progress('close');
			//
			var data = $.parseJSON(result);
			if (data.success){
				$.messager.alert('系统提示',data.msg,'info',function(){
					dForm.panel('close');
					find();
				});
			} else{
				$.messager.alert('系统提示',data.msg,'error');
			}
		}
	});
}
