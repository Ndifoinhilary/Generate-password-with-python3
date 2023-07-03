import random 

lowercase_letters  = 'abcdefghijklmnopqrstuv'
uppercaase = 'ABCDEFGHIJKLMNOPQRSTUQXYZ'
random_symboms = '!@#$%><%^&*'
creat_pass = lowercase_letters + uppercaase +random_symboms
length_of_password = 8

password = "".join(random.sample(creat_pass, length_of_password))
print(password)