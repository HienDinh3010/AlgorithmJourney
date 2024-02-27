AVILABLE_JUMP_STEPS = [1, 3, 13, 23, 43, 53]

def max_game_score(cells):
    n = len(cells)
    dp = [float('-inf')] * n
    dp[0] = cells[0]

    for i in range ( 1, n):
        for p in AVILABLE_JUMP_STEPS:
            if i - p >= 0:
                dp[i] = max(dp[i], dp[i - p] + cells[i])
            dp[i] = max(dp[i], dp[i - 1] + cells[i])

    return dp[-1]