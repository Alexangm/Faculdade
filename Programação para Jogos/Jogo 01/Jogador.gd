extends KinematicBody2D

const UP = Vector2(0, -1)
var motion = Vector2()
onready var queda: Timer = $Desaparece

func _physics_process(delta):	
	motion.y += 10
	motion.x = 0
	# print("X = {x}, Y = {y}".format({"x":position.x, "y":position.y}))
	
	if Input.is_action_pressed("ui_right"):
		motion.x = 100
		if is_on_floor():
			if Input.is_action_just_pressed("ui_up"):
				motion.y = -350
	elif Input.is_action_pressed("ui_left"):
		motion.x = -100
		if is_on_floor():
			if Input.is_action_just_pressed("ui_up"):
				motion.y = -350
	else:
		motion.x = 0
		
	if is_on_floor():
		if Input.is_action_just_pressed("ui_up"):
			motion.y = -350
			
	if motion.y >= 1000:
		get_tree().quit()
	
	motion = move_and_slide(motion, UP)
	
	"""
	for i in get_slide_count():
		var colisao = get_slide_collision(i)
		if colisao.collider.is_in_group("pisos"):
			print(colisao.collider.name)
			if colisao.collider.has_method("morte"):
				print("sim")
				colisao.collider.morte()
			else:
				print("nao")
	"""
	
	
	"""
	# print("Y = {}".format(position.y))
	# print(position.x)
	if Input.is_action_pressed("ui_right"):
		motion.x = 150
		if is_on_floor():
			if Input.is_action_just_pressed("ui_up"):
				motion.y = -400
		motion.y = 0
		print(position.x)
	if Input.is_action_pressed("ui_up"):
		motion.y = -150
		motion.x = 0
	if Input.is_action_pressed("ui_left"):
		motion.x = -150
		motion.y = 0
	if Input.is_action_pressed("ui_down"):
		motion.y = 150
		motion.x = 0

	motion = move_and_slide(motion, UP)
	"""
