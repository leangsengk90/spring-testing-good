{{- define "deployment.tpl" }}
apiVersion: apps/v1
kind: Deployment
metadata:
  name: {{ .Values.App.name }}
spec:
  replicas: {{ .Values.App.replicas }}
  selector:
    matchLabels:
      app: {{ .Values.App.name }}
  template:
    metadata:
      labels:
        app: {{ .Values.App.name }}
    spec:
      imagePullSecrets:
        - name: registry-secret
      containers:
        - name: {{ .Values.App.name }}
          image: {{ .Values.App.image.name }}:{{ .Values.App.image.tag }}
          ports:
            - containerPort: {{ .Values.App.port }}
          env:
	    {{- range .Values.App.env }}
             - name: {{ .name }}
               value: "{{ .value }}"
            {{- end }}
{{- end }}

