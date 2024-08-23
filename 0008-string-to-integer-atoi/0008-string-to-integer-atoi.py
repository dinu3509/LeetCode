class Solution(object):
    def myAtoi(self, s):
        s=s.lstrip()
        if not s:
            return 0
        flag = 1
        i=0
        if s[i]=="+":i+=1
        elif s[i] == "-":  
            i+=1
            flag = -1
        parsed = 0

        while i<len(s): 
            pre = s[i]
            if not pre.isdigit():
                break
            else:
                parsed = parsed * 10 +int(pre)
            i += 1
        parsed*=flag    
        if parsed>2**31-1:
            return (2**31-1 )   
        elif parsed<= -2**31:
            return -2**31
        else:
            return parsed