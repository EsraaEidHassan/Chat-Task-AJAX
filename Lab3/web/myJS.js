/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
      $("#send").click(function(e){
          var name = $("#name").val();
          var msg = $("#msg").val();
          $("#msg").val('');
          $.get("MessageDTO?name="+name+"&msg="+msg,ajaxCallBack);
      });
    });
    
setInterval(ajaxCallToPopulateTable, 3000); //300000 MS == 5 minutes
setInterval(ajaxCallToGetLogin, 3000);
function ajaxCallToPopulateTable() {
    $.post("MessageDTO",{},ajaxCallBack_msg,"json");
}
function ajaxCallToGetLogin() {
    $.get("GetLogin",{},ajaxCallBack_login,"json");
}

function ajaxCallBack_msg(responseTxt,statusTxt,xhr){
    if(statusTxt=='success'){
        //alert(responseTxt.msg+" , "+responseTxt.username);
        var msgs="";
        /*for(var i in responseTxt)
        {
             var res_username = responseTxt[i].username;
             var res_msg = responseTxt[i].msg;
             msgs = msgs +"User name : "+res_username+" , msg: "+ res_msg;
        }
        $("#msgs").html(msgs);
        */
        var test = '<table id="msgs" border="1px"><thead><tr><th>User Name:</th><th>Message: </th></tr></thead><tbody>';
        var tr='';
        for(var i in responseTxt){
            var res_username = responseTxt[i].username;
            var res_msg = responseTxt[i].msg;
            tr += '<tr>';
                tr += '<td>'+res_username+'</td>';
                tr += '<td>'+res_msg+'</td>';
            tr +='</tr>';
        }
            
        test += tr+'</tbody></table>';
        $("#msgs").html(test);
        }
    else
        alert("Error:"+xhr.status+":"+xhr.statusTxt);
}
    
function ajaxCallBack_login(responseTxt,statusTxt,xhr){
    if(statusTxt=='success'){
        //alert(responseTxt.msg+" , "+responseTxt.username);
        var msgs="";
        /*for(var i in responseTxt)
        {
             var res_username = responseTxt[i].username;
             var res_msg = responseTxt[i].msg;
             msgs = msgs +"User name : "+res_username+" , msg: "+ res_msg;
        }
        $("#msgs").html(msgs);
        */
        var test = '<table id="users_login" border="1px"><thead><tr><th>Logged in user : </th></tr></thead><tbody>';
        var tr='';
        for(var i in responseTxt){
            var res_username = responseTxt[i].fname;
            tr += '<tr>';
                tr += '<td>'+res_username+'</td>';
            tr +='</tr>';
        }
            
        test += tr+'</tbody></table>';
        $("#users").html(test);
        //alert("ok");
        }
    else
        alert("Error:"+xhr.status+":"+xhr.statusTxt);
}
function ajaxCallBack(responseTxt,statusTxt,xhr){
    if(statusTxt=='success')
        alert(responseTxt);
    else
        alert("Error:"+xhr.status+":"+xhr.statusTxt);
}


