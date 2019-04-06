/*
看《挑战程序设计竞赛》时试着提交了此题，思路及代码基本借鉴书以及
多谢：http://www.cnblogs.com/llhthinker/p/4844748.html

思路：
从任意的W开始，不停地把邻接的8个点用'.'代替。一次DFS后与一开始的W连接的所有W就被换成了'.'，计数加1，继续DFS直到图中无W。
*/

#include<cstdio>
const int MAX_N = 100, MAX_M = 100; //const必须初始化
int N, M;
char field[MAX_N][MAX_M +1]; //其实我挺好奇为啥列要+1，不加也过了

void dfs(int x, int y);

int main() {
	scanf("%d %d", &N, &M);
	char s;
	/*for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			scanf("%c", s);
			field[i][j] = s;
		}
	}*///错误写法。。。。。。
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
				//field[x][y] = '.'; //这句话主要是将走过的点变成'.'
				dfs(nx, ny);
			}
		}
	}
	return;
}


