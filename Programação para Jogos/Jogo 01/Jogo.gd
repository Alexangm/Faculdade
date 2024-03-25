extends Node
# Called when the node enters the scene tree for the first time.

onready var timer = get_node("Desaparece")
onready var pisos = get_node("Pisos").get_children()
onready var piso = pisos[0]
onready var vitoria = get_node("Personagens/Jogador2")
onready var i = 0

func _ready():
	timer.set_wait_time(2)
	timer.start()
	pass # Replace with function body.


# Called every frame. 'delta' is the elapsed time since the previous frame.
#func _process(delta):
#	pass


func _on_Desaparece_timeout():
	piso = pisos[i]
	i+= 1
	piso.queue_free()
	if i < 11:
		timer.set_wait_time(1)
		timer.start()
	else:
		print(vitoria)	
	pass # Replace with function body.
