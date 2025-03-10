package OOP.exercis6_2_5;

class Alphabet {
    private int a, b, c, d, e, f, g, h, i, j, k, l,
            m, n, o, p, q, r, s, t, u, v,
            w, x, y, z;


    private int sum;

    public void setA(int a) {
        this.a = a;
        updateSum();

    }

    public void setB(int b) {
        this.b = b;
        updateSum();
    }

    public void setC(int c) {
        this.c = c;

        updateSum();
    }

    public void setD(int d) {
        this.d = d;
        updateSum();

    }

    public void setE(int e) {
        this.e = e;
        updateSum();

    }

    public void setF(int f) {
        this.f = f;
        updateSum();

    }

    public void setG(int g) {
        this.g = g;
        updateSum();

    }

    public void setH(int h) {
        this.h = h;
        updateSum();

    }

    public void setI(int i) {
        this.i = i;
        updateSum();

    }

    public void setJ(int j) {
        this.j = j;
        updateSum();

    }

    public void setK(int k) {
        this.k = k;
        updateSum();

    }

    public void setL(int l) {
        this.l = l;
        updateSum();

    }

    public void setM(int m) {
        this.m = m;
        updateSum();

    }

    public void setN(int n) {
        this.n = n;
        updateSum();

    }

    public void setO(int o) {
        this.o = o;
        updateSum();

    }

    public void setP(int p) {
        this.p = p;
        updateSum();

    }

    public void setQ(int q) {
        this.q = q;
        updateSum();

    }

    public void setR(int r) {
        this.r = r;
        updateSum();
    }

    public void setS(int s) {
        this.s = s;
        updateSum();
    }

    public void setT(int t) {
        this.t = t;
        updateSum();

    }

    public void setU(int u) {
        this.u = u;
        updateSum();
    }

    public void setV(int v) {
        this.v = v;
        updateSum();

    }

    public void setW(int w) {
        this.w = w;
        updateSum();
    }

    public void setX(int x) {
        this.x = x;
        updateSum();

    }

    public void setY(int y) {
        this.y = y;
        updateSum();
    }

    public void setZ(int z) {
        this.z = z;
        updateSum();

    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private void updateSum() {
        sum = a + b + c + d + e + f + g + h + i + j + k + l +
                m + n + o + p + q + r + s + t + u + v +
                w + x + y + z;
    }

    public int getSum() {
        return sum;
    }
}
