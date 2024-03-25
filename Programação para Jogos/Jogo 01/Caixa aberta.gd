extends KinematicBody2D

const UP = Vector2(0, -1)
var motion = Vector2()

func _physics_process(delta):	
	motion.y = -10
	motion.x = 0
	# print("X = %d, Y = %d" % [position.x, position.y])
	print("X = {x}, Y = {y}".format({"x":position.x, "y":position.y}))
	
	# print("Y = {}".format(position.y))
	# print(position.x)
	if Input.is_action_pressed("ui_right"):
		motion.x = 150
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
