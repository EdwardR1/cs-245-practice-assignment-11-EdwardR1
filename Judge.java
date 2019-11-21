import java.util.*;

public class Judge {
    public int findJudge(int N, int[][] trust) {
        int judge = -1;
        LinkedList[] l = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            l[i] = new LinkedList();
        }

        for (int i = 0; i < trust.length; i++) {
            l[trust[i][1] - 1].add(trust[i][0]);
        }

        for (int i = 0; i < l.length; i++) {
            if (l[i].size() == N - 1) {
                judge = i + 1;
            }
        }

        for (int i = 0; i < l.length; i++) {
            if (l[i].contains(judge)) {
                return -1;
            }
        }

        return judge;

    }
}