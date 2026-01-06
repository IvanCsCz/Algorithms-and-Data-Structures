def search_substring(str, substr):
    indices = []
    substr_length = len(substr)
    str_length = len(str)

    for i in range(str_length - substr_length + 1):
        if str[i:i + substr_length] == substr:
            indices.append(i)

    return indices
