def knapsack_01(values, weights, total):
    total_items = len(weights)

    rows = total_items + 1
    cols = total + 1

    T = [[0 for _ in range(cols)] for _ in range(rows)]

    for i in range(1, rows):
        for j in range(1, cols):
            if j < weights[i - 1]:
                T[i][j] = T[i - 1][j]
            else:
                T[i][j] = max(T[i - 1][j], values[i - 1] + T[i - 1][j - weights[i - 1]])

    return T[rows - 1][cols -1]


def knapsack_01_recursive_util(values, weights, remaining_weight, total_items, current_item, memo):
    if current_item >= total_items or remaining_weight <= 0:
        return 0

    key = (total_items - current_item - 1, remaining_weight)

    if key in memo:
        return memo[key]

    if remaining_weight < weights[current_item]:
        max_value = knapsack_01_recursive_util(values, weights, remaining_weight, total_items, current_item + 1, memo)
    else:
        max_value = max(values[current_item] + knapsack_01_recursive_util(values, weights, remaining_weight - weights[current_item], total_items, current_item + 1, memo),
                        knapsack_01_recursive_util(values, weights, remaining_weight, total_items, current_item + 1, memo))

    memo[key] = max_value
    return max_value


def knapsack_01_recursive(values, weights, total_weight):
    memo = dict()
    return knapsack_01_recursive_util(values, weights, total_weight, len(values), 0, memo)


if __name__ == '__main__':
    total_weight = 7
    weights = [1, 3, 4, 5]
    values = [1, 4, 5, 7]
    expected = 9
    print(expected == knapsack_01(values, weights, total_weight))
    print(expected == knapsack_01_recursive(values, weights, total_weight))
    total_weight = 8
    weights = [2, 2, 4, 5]
    values = [2, 4, 6, 9]
    expected = 13
    print(expected == knapsack_01(values, weights, total_weight))
    print(expected == knapsack_01_recursive(values, weights, total_weight))
