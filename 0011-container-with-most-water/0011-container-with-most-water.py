class Solution:
    def maxArea(self, height: list[int]) -> int:
        left =0
        right=len(height)-1
        max_water=0

        while left < right:
            width=right-left
            water_height= min(height[left],height[right])

            water= width * water_height
            max_water = max(max_water,water)
        
            if height[left]>height[right]:
                right-=1
            else:
                left+=1

        return max_water           



