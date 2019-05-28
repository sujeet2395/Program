def interleavedword(a, b, c, i, j, k):
    if len(a)==i and len(b)==j and len(c)==k:
        return True
    if len(c)==k:
        return False
    if len(a)==i and len(b)==j:
        return False
    #res1=False, res2=False
    if a[i]==c[k]:
        res1=interleavedword(a, b, c, i+1, j, k+1)
        if res1:
            return res1;
    elif b[j]==c[k]:
        res2=interleavedword(a, b, c, i, j+1, k+1)
        if res2:
            return res2;
    return False
print(interleavedword('carf', 'applea', 'apcpleaarf', 0, 0, 0))
