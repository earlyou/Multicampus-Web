 function display(data){
	$('.time').text(data);
};

function getdata(){
	$.ajax({
		url:'gettime',
		success:function(data){	
			display(data);	
		},
		error:function(e){	
			alert('Error'+e.responseText);
		}
	});
};
function num(){		// phonenum에 숫자만 들어가도록 제어
	if(event.keyCode < 48 || event.keyCode > 57){
		event.returnValue = false;
	}
};
function Postcode() {	// daum이 제공하는 주소 찾는 API
    new daum.Postcode({
        oncomplete: function(data) {
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열 생성
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }
            // 우편번호와 주소 정보를 해당 필드에 기입
            document.getElementById('postcode').value = data.zonecode;
            document.getElementById("roadAddress").value = roadAddr;
            document.getElementById("jibunAddress").value = data.jibunAddress;
            document.getElementById('detailAddress').value = data.buildingName;
            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소 표시
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';
            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}

function addRow(tableid) {		// 테이블 행 추가 함수
	var table = document.getElementById(tableid);
	var rowlen = table.rows.length;
	var rownum = rowlen-3;
	var row = table.insertRow(rowlen-1);
	var date = new Date();
	var cyear = date.getFullYear();
	var txt = '';
	var giftedarray = new Array();
	var giftedjson = new Object();
	txt += "<option value>년도</option>"
	for (var i = (cyear-10); i <= (cyear); i++) {
		txt += "<option value='"+i+"'>"+i+"</option>";
	}
	row.insertCell(0).innerHTML = '<select class="form-control" id="yeartable'+rownum+'" name="yeartable'+rownum+'">'+txt+'</select>';
	row.insertCell(1).innerHTML = '<input type="text" class="form-control" id="gname'+rownum+'" placeholder="영재원명" name="gname'+rownum+'">';
	row.insertCell(2).innerHTML = '<label class="radio-inline" for="gin'+rownum+'"><input value="in" type="radio" id=gin"'+rownum+'" name="en'+rownum+'">재학</label><label class="radio-inline" for="gout'+rownum+'"><input value="out" type="radio" id=gout"'+rownum+'" name="en'+rownum+'">수료</label>';
}

function deleteRow(tableid) {	// 테이블 행 제거 함수
	var table = document.getElementById(tableid);
	var rowlen = table.rows.length;
	if (rowlen < 5) {
		return;
	}
	var row = table.deleteRow(rowlen-2);
}
function checkid(id){		// id 검사 ajax
	$.ajax({
		url:'checkid',
		data:{'id':id},
		success:function(data){
			if (data == '1') {
				$('#sid').text('');
				$('#sid').attr('class','glyphicon glyphicon-check');
				$('#sid').addClass('correct');
			}else {
				$('#sid').removeClass('correct');
				$('#sid').attr('class','validation');
				$('#sid').text('중복 아이디가 있습니다.')
			}
		}
	});
};
function check(obj){		// 특수문자가 들어갈 수 없도록 제어
	var regExp = /[ \{\}\[\]\/?.,;:|\)*~`!^\-_+┼<>@\#$%&\'\"\\\(\=]/gi;
	
	if( regExp.test(obj.value) ){
	   obj.value = obj.value.substring( 0 , obj.value.length - 1 ); 
	}
};