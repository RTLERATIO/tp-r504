from flask import request, Flask
import jsonapp1 = Flask(__name__)
@app1.route('/')
def hello_world():
return 'Salam alikom, this is App2 :) '
if __name__ == '__main__':
app1.run(debug=True, host='0.0.0.0')