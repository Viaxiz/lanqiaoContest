/*
来自《啊哈，算法！》一书中的例程，关于深搜的学习
@Viaxiz at 4th,April,2019
情景描述：
	现在输入一个数字，（介于1-9之间），输出其全排列
*/
#include<cstdio>
int arr[10];
int book[10]; //标记位置有没有用过
int num; 

void dfs(int step) {  //step现在表示在哪个位置
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

/*关于深搜的模板：
void dfs(int step)
{
	判断边界；
	尝试每一种可能: for(i=1;i<=n;i++)
	{
		继续下一步: dfs(step+1);
	}
	返回;
}
*/
//或者更好地理解
/*
dfs(状态）
	if 状态是目标状态
		then do something
	else
		for 每个合法的新状态
			dfs(新状态)

主程序：
	dfs(初始状态)
*/