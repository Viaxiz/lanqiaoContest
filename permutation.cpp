#include<cstdio>
#define MAX_N 100000000
bool used[MAX_N];
int arr[] = { 1,2,3,4,5,6,7,8,9 };

//通过递归来迭代输出,类似dfs
void permutation(int pos,int n)
{
	if (pos == n) {
		//要进行的操作，比如凑算式
			if (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] == arr[6] * 10 + arr[7]+arr[8]) {
				printf("%d%d%d%d%d%d%d%d%d\n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
			}
		return;
	}

	for (int i = 0; i < n; i++) {
		if (!used[i]) {
			arr[pos] = i;
			used[i] = true;
			permutation(pos + 1, n);
			used[i] = false;
		}
	}
	return;
}

int main()
{
	permutation(0, 9);
	getchar();
	return 0;
}

