/*����ģʽ����������
 *number:���ϵ�����
 *type:�ƵĻ�ɫ
 */
var Cards = (function () {
	var Card = function (number, type) {
		this.number = number;
		this.type = type;
	};
	return function (number, type) {
		return new Card(number, type);
	};
	
	var RadomCards = [];	//����ƴ洢����
	var MyCards = [];	//�洢����������
	
})();



//��ɫ0-���� 1-÷�� 2-����  3-���� 4-���  5-С��
//��ֵ0-13���� ��,1,2,3,4,5,6,7,8,9,10,J,Q,K;
function CreatCompeleteCard() {
	var index = 2;
	var arr = [];
	for (var i = 0; i <= 13; i++) {
		if (i == 0) {
			arr[0] = new Cards(i, 4);
			arr[1] = new Cards(i, 5);
		} else {
			for (var j = 0; j <= 3; j++) {
				arr[index] = new Cards(i, j);
				index++;
			}
		}
	}
	RadomCards = SortCards(arr);
	Show();//��ҳ������ʾ��ǰ����
}
//ϴ��
function SortCards(arr) {
	arr.sort(function (a, b) {
		return 0.5 - Math.random();
	});
	return arr;
}

//���Ʒ���
function GetCards(CardObj) {
	var k = InCardsIndex(MyCards, CardObj);//�����²����λ��
	MyCards.splice(k, 0, CardObj); // �����γ��µ�˳��
}
/*����ȡ��Ӧ�ò����λ�á�
 *arr:��ǰ�������
 *obj:����������
 */
function InCardsIndex(arr, obj) {
	var len = arr && arr.length || 0;
	if (len == 0) {
		return 0;
	}else if (len == 1) {
		if (obj.number >= arr[0].number) {
			return 1;
		} else {
			return 0;
		}
	} else {
		var backi = -1;
		for (var i = 0; i < len; i++) {

			if (obj.number <= arr[i].number) {
				backi = i;
				break;
			}
		}
		if (backi == -1) {
			backi = len;
		}
		return backi;
	}
}

function Start() {//���Ʒ�����һ����һ��
	if (RadomCards.length > 0) {
		GetCards(RadomCards.shift());
		Show();
	} else {
		alert("û����");
	}
}
//��show������������ҳ��չʾ��ǰ�ƵĶ���
function Show() {
	var lenOld = RadomCards.length;
	var lenNew = MyCards.length;
	var html = "";
	for (var i = 0; i < lenOld; i++) {
		html += "<div class='pai'><b>" + RadomCards[i].type + "</b>-<div class='nu'>" + RadomCards[i].number + "</div></div>";
	}
	document.getElementById("old").innerHTML=html;
	html = "";
	for (var i = 0; i < lenNew; i++) {
		html += "<div class='pai new'><b>" + MyCards[i].type + "</b>-<div class='nu'>" + MyCards[i].number + "</div></div>";
	}
	document.getElementById("new").innerHTML=html;
}