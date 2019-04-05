/*
判断数组中的元素能不能凑成相应的值；
*/
#include<cstdio>
int a[] = { 1,2,4,7 };
int goal = 13;

bool dfs(int i, int sum) {
	if (i == sizeof(a) / 4) //深搜到底了
		return sum == goal;	//返回真或假到上一层
	if (dfs(i + 1, sum))	//在不使用a[i]的情况下继续进行深搜
		return true;		//若成功则返回true，如不成功则使用a[i]
	if (dfs(i + 1, sum + a[i]))		//在使用a[i]的情况下继续进行深搜
		return true;				//若成功则返回true，不成功返回false
	return false;
}

int main() {
	printf("%d", dfs(0, 0)); //输出1
	getchar(); getchar();
	return 0;
}



