/*
�ж������е�Ԫ���ܲ��ܴճ���Ӧ��ֵ��
*/
#include<cstdio>
int a[] = { 1,2,4,7 };
int goal = 13;

bool dfs(int i, int sum) {
	if (i == sizeof(a) / 4) //���ѵ�����
		return sum == goal;	//�������ٵ���һ��
	if (dfs(i + 1, sum))	//�ڲ�ʹ��a[i]������¼�����������
		return true;		//���ɹ��򷵻�true���粻�ɹ���ʹ��a[i]
	if (dfs(i + 1, sum + a[i]))		//��ʹ��a[i]������¼�����������
		return true;				//���ɹ��򷵻�true�����ɹ�����false
	return false;
}

int main() {
	printf("%d", dfs(0, 0)); //���1
	getchar(); getchar();
	return 0;
}



