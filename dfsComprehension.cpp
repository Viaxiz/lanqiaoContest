/*
���ԡ��������㷨����һ���е����̣��������ѵ�ѧϰ
@Viaxiz at 4th,April,2019
�龰������
	��������һ�����֣�������1-9֮�䣩�������ȫ����
*/
#include<cstdio>
int arr[10];
int book[10]; //���λ����û���ù�
int num; 

void dfs(int step) {  //step���ڱ�ʾ���ĸ�λ��
	int i;
	if (step == num + 1)
	{
		for (i = 1; i <= num; i++)
			printf("%d", arr[i]);
		printf("\n");

		return;
	}

	for (i = 1; i <= num; i++)
	{
		if (book[i] == 0)
		{
			arr[step] = i;
			book[i] = 1;
			dfs(step + 1);
			book[i] = 0;
		}
	}
	return;
}

int main() {
	scanf("%d", &num);
	dfs(1);
	getchar(); getchar();
	return 0;
}

/*�������ѵ�ģ�壺
void dfs(int step)
{
	�жϱ߽磻
	����ÿһ�ֿ���: for(i=1;i<=n;i++)
	{
		������һ��: dfs(step+1);
	}
	����;
}
*/
//���߸��õ����
/*
dfs(״̬��
	if ״̬��Ŀ��״̬
		then do something
	else
		for ÿ���Ϸ�����״̬
			dfs(��״̬)

������
	dfs(��ʼ״̬)
*/