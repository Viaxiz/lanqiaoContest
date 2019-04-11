/*
the most part of code comes from the book ����ս���������š�
*/
#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;

const int MAX_N = 100, MAX_M = 100;
const int INF = 100000000;

//ʹ��pair��ʾ״̬ʱ��ʹ��typedef������һЩ
typedef pair <int, int >P;  
//����
char maze[MAX_N][MAX_M + 1];
int N, M;
int sx, sy;		//�������	
int gx, gy;		//�յ�����

int d[MAX_N][MAX_M];	//������λ�õ���̾��������
//4�������ƶ��ķ���
int dx[4] = { 1,0,-1,0 }, dy[4] = { 0,1,0,-1 };

//���(sx,sy)����gx,gy������̾���
//����޷���������INF
int bfs() {
	queue<P> que;
	//�����е�λ�ó�ʼ��ΪINF
	for (int i = 0; i < N; i++)
		for (int j = 0; j < M; j++)
			d[i][j] = INF;
	//����������У�������һ�ص�ľ�������Ϊ0
	que.push(P(sx, sy));
	d[sx][sy] = 0;
	//����ѭ��ֱ�����еĳ���Ϊ0
	while (que.size()) {
		//�Ӷ��е���ǰ��ȡ��Ԫ��
		P p = que.front();
		que.pop();
		//���ȡ����״̬�����յ㣬���������
		if (p.first == gx && p.second == gy)
			break;
		//�ĸ������ѭ��
		for (int i = 0; i < 4; i++)
		{
			//�ƶ�֮��ľ����Ϊ(nx,ny);
			int nx = p.first + dx[i], ny = p.second + dy[i];
			//�ж��Ƿ�����ƶ����Լ��Ƿ��Ѿ����ʹ�(d[nx][ny]!=INF��Ϊ�Ѿ����ʹ�)
			if (0 <= nx && nx < N && 0 <= ny && ny < M&&maze[nx][ny] != '#'&&d[nx][ny] == INF)
			{
				//�����ƶ��Ļ��������У����ҵ���λ�õľ���ȷ��Ϊ��p�ľ���+1
				que.push(P(nx, ny));
				d[nx][ny] = d[p.first][p.second] + 1;
			}
		}
	}
	return d[gx][gy];
}

int  main() {
	//�����Թ�
	scanf("%d%d", &N, &M);
	for (int i = 0; i < N; i++) {
		scanf("%s", maze[i]);
	}
	//�������������յ�����
	scanf("%d%d%d%d", &sx, &sy, &gx, &gy);
	int res = bfs();
	printf("%d\n", res);
	system("pause");
	return 0;
}


