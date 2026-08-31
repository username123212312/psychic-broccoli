def greet():
    greeting = "Hello"
    print(greeting)
    return greeting


def combine(prefix, suffix):
    message = prefix + suffix
    return message


def outer():
    label = "outer"
    def inner():
        return label
    return inner


print(greet())
print(combine("a", "b"))
result = outer()
print(result)