/*
������ս������ƾ�����ʱ�����ύ�˴��⣬˼·���������������Լ�
��л��http://www.cnblogs.com/llhthinker/p/4844748.html

˼·��
�������W��ʼ����ͣ�ذ��ڽӵ�8������'.'���档һ��DFS����һ��ʼ��W���ӵ�����W�ͱ�������'.'��������1������DFSֱ��ͼ����W��
*/

#include<cstdio>
const int MAX_N = 100, MAX_M = 100; //const�����ʼ��
int N, M;
char field[MAX_N][MAX_M +1]; //��ʵ��ͦ����Ϊɶ��Ҫ+1������Ҳ����

void dfs(int x, int y);

int main() {
	scanf("%d %d", &N, &M);
	char s;
	/*for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			scanf("%c", s);
			field[i][j] = s;
		}
	}*///����д��������������
	for (int i = 0; i < N; i++)
		scanf("%s", field[i]);
	int res = 0;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			if (field[i][j] == 'W') {
				dfs(i, j);
				res++;
			}
		}
	}
	printf("%d\n", res);
	return 0;
}

void dfs(int x, int y)
{
	field[x][y] = '.';

	for (int dx = -1; dx <= 1; dx++) {
		for (int dy = -1; dy <= 1; dy++) {
			int nx = x + dx, ny = y + dy;
			if (0 <= nx && nx < N && 0 <= ny && ny < M&&field[nx][ny] == 'W') {
				//field[x][y] = '.'; //��仰��Ҫ�ǽ��߹��ĵ���'.'
				dfs(nx, ny);
			}
		}
	}
	return;
}


