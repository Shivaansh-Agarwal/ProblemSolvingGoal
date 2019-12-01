class Solution:
    def toHexspeak(self, num: str) -> str:
        hexadecimal = hex(int(num))
        n = len(hexadecimal)
        ans = ""
        arr = ["A","B","C","D","E","F","I","O"]
        for i in range(2,n):
            if (hexadecimal[i].upper() in arr) or (hexadecimal[i]=="1") or (hexadecimal[i]=="0"):
                if hexadecimal[i]=="1":
                    ans += "I"
                elif hexadecimal[i]=="0":
                    ans += "O"
                else:
                    ans += hexadecimal[i].upper()
            else:
                ans = "ERROR"
                break
        return ans
